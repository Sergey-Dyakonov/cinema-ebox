CREATE TABLE IF NOT EXISTS t_person_role (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    person_role VARCHAR(128)            NOT NULL
);

CREATE TABLE IF NOT EXISTS t_person (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    first_name  VARCHAR(64)             NOT NULL,
    last_name   VARCHAR(64)
);

CREATE TABLE IF NOT EXISTS t_country (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    country     VARCHAR(128)            NOT NULL
);

CREATE TABLE IF NOT EXISTS t_genre (
    id      BIGSERIAL PRIMARY KEY   NOT NULL,
    genre   VARCHAR(128)            NOT NULL
);

CREATE TABLE IF NOT EXISTS t_limitation (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    limitation  VARCHAR(16)             NOT NULL
);

CREATE TABLE IF NOT EXISTS t_cinema (
    id      BIGSERIAL PRIMARY KEY   NOT NULL,
    address VARCHAR(128)            NOT NULL
);

CREATE TABLE IF NOT EXISTS t_hall (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    hall_name   VARCHAR(128)            NOT NULL
);

CREATE TABLE IF NOT EXISTS t_place_type (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    place_type  VARCHAR(128)            NOT NULL
);

CREATE TABLE IF NOT EXISTS t_place (
    id              BIGSERIAL PRIMARY KEY   NOT NULL,
    row             INT                     NOT NULL,
    seat            INT                     NOT NULL,
    place_type_id   BIGINT                  NOT NULL,

    CONSTRAINT fk_t_type_t_place FOREIGN KEY (place_type_id) REFERENCES t_place_type (id)
);

CREATE TABLE IF NOT EXISTS t_user (
    id BIGSERIAL    PRIMARY KEY     NOT NULL,
    first_name      VARCHAR(64)     NOT NULL,
    last_name       VARCHAR(64)     NOT NULL,
    phone           VARCHAR(64)     NOT NULL,
    email           VARCHAR(512)    NOT NULL,
    password        VARCHAR(512)    NOT NULL
);

CREATE TABLE IF NOT EXISTS t_movie (
    id              BIGSERIAL PRIMARY KEY   NOT NULL,
    title           VARCHAR(512)            NOT NULL,
    description     VARCHAR(2048)           NOT NULL,
    poster_url      VARCHAR (512)           NOT NULL,
    limitation_id   BIGINT                  NOT NULL,
    duration        INT                     NOT NULL,
    released_in     INT                     NOT NULL,
    show_start_date DATE                    NOT NULL,

    CONSTRAINT fk_t_limitation_t_movie FOREIGN KEY (limitation_id) REFERENCES t_limitation (id)
);

CREATE TABLE IF NOT EXISTS t_session (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    movie_id    BIGINT                  NOT NULL,
    cinema_id   BIGINT                  NOT NULL,
    hall_id     BIGINT                  NOT NULL,
    starts_at   TIMESTAMP               NOT NULL,

    CONSTRAINT fk_t_movie_t_session FOREIGN KEY (movie_id) REFERENCES t_movie (id),
    CONSTRAINT fk_t_cinema_t_session FOREIGN KEY (cinema_id) REFERENCES t_cinema (id),
    CONSTRAINT fk_t_hall_t_session FOREIGN KEY (hall_id) REFERENCES t_hall (id)
);

CREATE TABLE IF NOT EXISTS t_movie_genre (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    genre_id BIGINT NOT NULL,
    movie_id BIGINT NOT NULL,

    CONSTRAINT fk_t_genre_t_movie_genre FOREIGN KEY (genre_id) REFERENCES t_genre (id),
    CONSTRAINT fk_t_movie_t_movie_genre FOREIGN KEY (movie_id) REFERENCES t_movie (id)
);

CREATE TABLE IF NOT EXISTS t_movie_country (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    country_id  BIGINT                  NOT NULL,
    movie_id    BIGINT                  NOT NULL,

    CONSTRAINT fk_t_country_t_movie_country FOREIGN KEY (country_id) REFERENCES t_country (id),
    CONSTRAINT fk_t_movie_t_movie_country FOREIGN KEY (movie_id) REFERENCES t_movie (id)
);

CREATE TABLE IF NOT EXISTS t_movie_cast (
    id              BIGSERIAL PRIMARY KEY   NOT NULL,
    movie_id        BIGINT                  NOT NULL,
    person_id       BIGINT                  NOT NULL,
    person_role_id  BIGINT                  NOT NULL,

    CONSTRAINT fk_t_movie_t_movie_cast FOREIGN KEY (movie_id) REFERENCES t_movie (id),
    CONSTRAINT fk_t_person_t_movie_cast FOREIGN KEY (person_id) REFERENCES t_person (id),
    CONSTRAINT fk_t_person_role_t_movie_cast FOREIGN KEY (person_role_id) REFERENCES t_person_role (id)
);

CREATE TABLE IF NOT EXISTS t_hall_cinema (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    hall_id     BIGINT                  NOT NULL,
    cinema_id   BIGINT                  NOT NULL,

    CONSTRAINT fk_t_hall_t_hall_cinema FOREIGN KEY (hall_id) REFERENCES t_hall (id),
    CONSTRAINT fk_t_cinema_t_hall_cinema FOREIGN KEY (cinema_id) REFERENCES t_cinema (id)
);

CREATE TABLE IF NOT EXISTS t_hall_place (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    hall_id     BIGINT                  NOT NULL,
    place_id    BIGINT                  NOT NULL,

    CONSTRAINT fk_hall_t_hall_place FOREIGN KEY (hall_id) REFERENCES t_hall (id),
    CONSTRAINT fk_place_t_hall_place FOREIGN KEY (place_id) REFERENCES t_place (id)
);

CREATE TABLE IF NOT EXISTS t_price (
    id              BIGSERIAL PRIMARY KEY   NOT NULL,
    session_id      BIGINT                  NOT NULL,
    place_type_id   BIGINT                  NOT NULL,
    price           FLOAT                   NOT NULL,

    CONSTRAINT fk_t_session_t_price FOREIGN KEY (session_id) REFERENCES t_session (id),
    CONSTRAINT fk_t_place_type_t_price FOREIGN KEY (place_type_id) REFERENCES t_place_type (id)
);

CREATE TABLE IF NOT EXISTS t_ticket (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    session_id  BIGINT                  NOT NULL,
    place_id    BIGINT                  NOT NULL,
    user_id     BIGINT                  NOT NULL,
    price_id    BIGINT                  NOT NULL,
    created_at  TIMESTAMP               NOT NULL,

    CONSTRAINT fk_t_session_t_ticket FOREIGN KEY (session_id) REFERENCES t_session (id),
    CONSTRAINT fk_t_place_t_ticket FOREIGN KEY (place_id) REFERENCES t_place (id),
    CONSTRAINT fk_t_user_t_ticket FOREIGN KEY (user_id) REFERENCES t_user (id),
    CONSTRAINT fk_t_price_t_ticket FOREIGN KEY (price_id) REFERENCES t_price (id)
);