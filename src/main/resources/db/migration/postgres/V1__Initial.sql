CREATE TABLE IF NOT EXISTS t_user (
    id BIGSERIAL    PRIMARY KEY     NOT NULL,
    first_name      VARCHAR(64)     NOT NULL,
    last_name       VARCHAR(64)     NOT NULL,
    phone           VARCHAR(64)     NOT NULL,
    email           VARCHAR(512)    NOT NULL,
    password        VARCHAR(512)    NOT NULL
);

CREATE TABLE IF NOT EXISTS t_ticket (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    session_id  BIGINT                  NOT NULL,
    place_id    BIGINT                  NOT NULL,

    created_at  TIMESTAMP               NOT NULL
);

CREATE TABLE IF NOT EXISTS t_session (
    id          BIGSERIAL PRIMARY KEY   NOT NULL,
    movie_id    BIGINT                  NOT NULL,
    starts_at   TIMESTAMP               NOT NULL,

);

CREATE TABLE IF NOT EXISTS t_movie (
    id              BIGSERIAL PRIMARY KEY   NOT NULL,
    title           VARCHAR(512)            NOT NULL,
    description     VARCHAR(2048)           NOT NULL,
    poster_url      VARCHAR (512)           NOT NULL,
    limitation_id   VARCHAR(128)            NOT NULL,
    duration        INT                     NOT NULL,
    released_in     DATE                    NOT NULL,
    show_start_date DATE                    NOT NULL,

    CONSTRAINT fk_t_limitation_t_movie FOREIGN KEY (limitation_id) REFERENCES t_limitation (id)
);

CREATE TABLE IF NOT EXISTS t_movie_genre (
    id BIGSERIAL PRIMARY KEY NOT NULL,
    genre_id BIGINT NOT NULL,
    movie_id BIGINT NOT NULL,

    CONSTRAINT fk_t_genre_t_movie_genre FOREIGN KEY (genre_id) REFERENCES t_genre (id),
    CONSTRAINT fk_t_movie_t_movie_genre FOREIGN KEY (movie_id) REFERENCES t_movie (id)
);

CREATE TABLE IF NOT EXISTS t_movie_contry (
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