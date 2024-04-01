INSERT INTO t_user (first_name, last_name, phone, email, password)
VALUES ('Adam', 'Sendid', '+1234567890', 'cool_guy_1@gmail.com', 'qwerty'),
       ('Lora', 'Sendid', '+1234567890', 'cool_guy_2@gmail.com', 'qwerty'),
       ('Pika', 'Loveless', '+1234567890', 'cool_guy_3@gmail.com', 'qwerty'),
       ('Jim', 'Moriarty', '+1234567890', 'cool_guy_4@gmail.com', 'qwerty'),
       ('Rita', 'Scitter', '+1234567890', 'cool_guy_5@gmail.com', 'qwerty'),
       ('Rick', 'Birdy', '+1234567890', 'cool_guy_6@gmail.com', 'qwerty'),
       ('Nick', 'Openread', '+1234567890', 'cool_guy_7@gmail.com', 'qwerty'),
       ('Bill', 'Syme', '+1234567890', 'cool_guy_8@gmail.com', 'qwerty'),
       ('Winston', 'Parson', '+1234567890', 'cool_guy_9@gmail.com', 'qwerty');

INSERT INTO t_place_type (place_type)
VALUES ('COMMON'),
       ('VIP'),
       ('EXTENDED'),
       ('LUXURY');

INSERT INTO t_cinema (address)
VALUES ('Ukraine, Kyiv Region, Kyiv, Peremohi St., 12'),
       ('Ukraine, Kharkiv Region, Kharkiv, Sumska St., 14'),
       ('Ukraine, Donetsk Region, Mariupol, Zaporizke Highway, 1 (PortCity Mall)');

INSERT INTO t_limitation (limitation)
VALUES ('18+'),
       ('21+'),
       ('14+'),
       ('12+'),
       ('16+'),
       ('0+'),
       ('7+');

INSERT INTO t_genre (genre)
VALUES ('Adventures'),
       ('Detective'),
       ('Blockbuster'),
       ('Soap opera'),
       ('Science-fiction'),
       ('Fantasy'),
       ('Cartoon'),
       ('Comedy'),
       ('Thriller'),
       ('Action'),
       ('Road-movie'),
       ('Documentary');

INSERT INTO t_hall (hall_name)
VALUES ('Red Hall'),
       ('Green Hall'),
       ('Blue Hall'),
       ('Venice'),
       ('Hollywood'),
       ('Berlin'),
       ('Paris'),
       ('Kyiv'),
       ('London');

INSERT INTO t_country (country)
VALUES ('Ukraine'),
       ('USA'),
       ('Great Britain'),
       ('France'),
       ('Germany'),
       ('Canada'),
       ('Egypt'),
       ('Turkey'),
       ('Japan'),
       ('China'),
       ('India'),
       ('Nigeria'),
       ('Mexico'),
       ('Brazil'),
       ('Argentina');

INSERT INTO t_person (first_name, last_name)
VALUES ('Timothy', 'Shalala'),
       ('Luk', 'Bessok'),
       ('Zendey', null),
       ('Johnny', 'Dipp'),
       ('Ben', 'Afleck'),
       ('Matt', 'Daemon'),
       ('Benedict', 'Cumburbetch'),
       ('Emma', 'Wotson'),
       ('Melissa', 'McCurthy'),
       ('Ann', 'Heathway'),
       ('Petersok', null),
       ('Christoper', 'Nolam'),
       ('David', 'Eayts'),
       ('Dany', 'Vilniv'),
       ('Tom', 'Hinks'),
       ('Tom', 'Hardly'),
       ('Cillian', 'Marphy'),
       ('Amily', 'Blank'),
       ('Scarlet', 'Johamson'),
       ('Natali', 'Portmack'),
       ('Jeniffer', 'Lawrince'),
       ('Jeniffer', 'Ankiston'),
       ('Sandra', 'Bulldog'),
       ('Margo', 'Ribbon'),
       ('Kira', 'Nightfly');

INSERT INTO t_person_role (person_role)
VALUES ('DIRECTOR'),
       ('ACTOR'),
       ('SCRIPTWRITER');

INSERT INTO t_movie (title, description, poster_url, limitation_id, duration, released_in, show_start_date)
VALUES ('Dune 2', '«Дюна: Частина друга» розкаже про міфічну подорож Пола Атріда та фременів на шляху помсти заколотникам, які знищили його родину. Між коханням усього свого життя та долею відомого всесвіту він обирає боротьбу проти жахливого майбутнього, яке лиш він може передбачити.', 'http://poster-url.com/dune-2', 5, 166, 2024, '2024-02-29'),
    ('Ghostbusters: Frozen Empire', 'Продовження фантастичних пригод з оригінального всесвіту Мисливців на привидів! Нове та старе покоління «Мисливців» мусить об’єднати зусилля аби протистояти загрозі небачених досі масштабів та врятувати світ від другого Льодовикового періоду!', 'http://poster-url.com/ghostbusters-frozen-empire', 4, 115, 2024, '2024-03-21'),
    ('Я, "Побєда" і Берлін', 'Початок 1990-х. Молодий музикант на прізвисько Кузьма купує старий автомобіль "Побєда". Хлопець вирушає цією машиною до Берліна, де хоче обміняти її на шестисотий «Мерседес». У дорогу він вирушає разом із другом, який планує продати у Німеччині старі радянські манекени. А в самому Берліні Кузьма знайомиться із місцевим рок-музикантом, який підштовхує головного героя вперше вийти на закордонну сцену. Вся ця подорож до столиці Німеччини повна цілого ряду кумедних колізій.', 'http://poster-url.com/poster-3', 4, 104, 2024, '2024-03-12'),
    ('20 Dlays in Mariupol', 'Команда українських журналістів/-ок Associated Press опинилася в оточеному Маріуполі. Вони намагаються продовжувати свою роботу з документування звірств російського вторгнення. Як єдині міжнародні репортер(к)и, що залишилися в місті, вони фіксують кадри, які пізніше стануть визначальними образами війни: смерті дітей, масові поховання, розбомблений пологовий будинок та інші жахи. Після майже десятиліття висвітлення міжнародних конфліктів, включно з війною Росії проти України, у складі репортерів/-ок Associated Press Мстислав Чернов створює свій перший повнометражний фільм «20 днів у Маріуполі». Стрічка ґрунтується на щоденних репортажах Чернова та його особистих зйомках власної країни у війні. Це чітко вималюваний, болісний образ мирних громадян/-ок, які опинилися в облозі. Крім того, фільм показує, як воно — вести репортажі з зони конфлікту, а також роль та вплив такої журналістики по всьому світу', 'http://poster-url.com/poster-4', 1, 94, 2023, '2023-06-02'),
    ('Kung Fu Panda 4', 'Здобувши три перемоги над лиходіями світового рівня завдяки неперевершеній відвазі та шаленим навичкам бойових мистецтв, легендарному воїну По нарешті світить відпочинок… Точніше, він мусить стати Духовним лідером Долини Миру.', 'http://poster-url.com/5', 6, 94, 2024, '2024-03-07'),
    ('Immaculate', 'Американська монахиня Сесилія вирушає до віддаленого монастиря у мальовничій італійській місцині. Невдовзі теплий прийом перетворюється на кошмар. Сесилія зʼясовує, що нова домівка приховує страшну таємницю та нечувані жахіття', 'http://poster-url.com/6', 1, 90, 2024, '2024-03-01'),
    ('Смак Свободи', 'Молода дівчина – кухар Варя втрачає роботу, бо її висока кухня нікому не потрібна у придорожньому кафе. Мила, енергійна, дотепна – вона тікає якомога далі від дому у пошуку реалізації ! Та неочікувана знахідка – книжка забутої легенди української кухні Ольги Франко змінює її життя назавжди!', 'http://poster-url.com/7', 4, 116, 2024, '2024-03-07');

INSERT INTO t_place (row, seat, place_type_id)
VALUES (1, 1, 1),
       (1, 2, 1),
       (1, 3, 1),
       (1, 4, 1),
       (1, 5, 1),
       (2, 1, 1),
       (2, 2, 1),
       (2, 3, 1),
       (2, 4, 1),
       (2, 5, 1),
       (3, 1, 1),
       (3, 2, 1),
       (3, 3, 1),
       (3, 4, 1),
       (3, 5, 1),
       (4, 1, 1),
       (4, 2, 1),
       (4, 3, 1),
       (4, 4, 1),
       (4, 5, 1),
       (5, 1, 1),
       (5, 2, 1),
       (5, 3, 1),
       (5, 4, 1),
       (5, 5, 1),
       (3, 1, 2),
       (3, 2, 2),
       (3, 3, 2),
       (3, 4, 2),
       (3, 5, 2),
       (5, 1, 3),
       (5, 2, 3),
       (5, 3, 3),
       (5, 4, 3),
       (5, 5, 3),
       (1, 1, 4),
       (1, 2, 4);

INSERT INTO t_hall_cinema (hall_id, cinema_id)
VALUES (1,1),
       (2,1),
       (3,1),
       (4,2),
       (5,2),
       (6,2),
       (7,3),
       (8,3),
       (9,3);

INSERT INTO t_hall_place (hall_id, place_id)
VALUES (1,1),
       (1,2),
       (1,3),
       (1,4),
       (1,5),
       (1,6),
       (1,7),
       (1,8),
       (1,9),
       (1,10),
       (1,11),
       (1,12),
       (1,13),
       (1,14),
       (1,15),
       (1,16),
       (1,17),
       (1,18),
       (1,19),
       (1,20),
       (1,21),
       (1,22),
       (1,23),
       (1,24),
       (1,25),
       (1,26),
       (1,27),
       (1,28),
       (1,29),
       (1,30),
       (1,31),
       (1,32),
       (1,33),
       (1,34),
       (1,35),
       (1,36),
       (1,37),
       (2,1),
       (2,2),
       (2,3),
       (2,4),
       (2,5),
       (2,6),
       (2,7),
       (2,8),
       (2,9),
       (2,10),
       (2,11),
       (2,12),
       (2,13),
       (2,14),
       (2,15),
       (2,16),
       (2,17),
       (2,18),
       (2,19),
       (2,20),
       (2,21),
       (2,22),
       (2,23),
       (2,24),
       (2,25),
       (2,26),
       (2,27),
       (2,28),
       (2,29),
       (2,30),
       (2,31),
       (2,32),
       (2,33),
       (2,34),
       (2,35),
       (2,36),
       (2,37),
       (3,1),
       (3,2),
       (3,3),
       (3,4),
       (3,5),
       (3,6),
       (3,7),
       (3,8),
       (3,9),
       (3,10),
       (3,11),
       (3,12),
       (3,13),
       (3,14),
       (3,15),
       (3,16),
       (3,17),
       (3,18),
       (3,19),
       (3,20),
       (3,21),
       (3,22),
       (3,23),
       (3,24),
       (3,25),
       (3,26),
       (3,27),
       (3,28),
       (3,29),
       (3,30),
       (3,31),
       (3,32),
       (3,33),
       (3,34),
       (3,35),
       (3,36),
       (3,37),
       (4,1),
       (4,2),
       (4,3),
       (4,4),
       (4,5),
       (4,6),
       (4,7),
       (4,8),
       (4,9),
       (4,10),
       (4,11),
       (4,12),
       (4,13),
       (4,14),
       (4,15),
       (4,16),
       (4,17),
       (4,18),
       (4,19),
       (4,20),
       (4,21),
       (4,22),
       (4,23),
       (4,24),
       (4,25),
       (4,26),
       (4,27),
       (4,28),
       (4,29),
       (4,30),
       (4,31),
       (4,32),
       (4,33),
       (4,34),
       (4,35),
       (4,36),
       (4,37),
       (5,1),
       (5,2),
       (5,3),
       (5,4),
       (5,5),
       (5,6),
       (5,7),
       (5,8),
       (5,9),
       (5,10),
       (5,11),
       (5,12),
       (5,13),
       (5,14),
       (5,15),
       (5,16),
       (5,17),
       (5,18),
       (5,19),
       (5,20),
       (5,21),
       (5,22),
       (5,23),
       (5,24),
       (5,25),
       (5,26),
       (5,27),
       (5,28),
       (5,29),
       (5,30),
       (5,31),
       (5,32),
       (5,33),
       (5,34),
       (5,35),
       (5,36),
       (5,37),
       (6,1),
       (6,2),
       (6,3),
       (6,4),
       (6,5),
       (6,6),
       (6,7),
       (6,8),
       (6,9),
       (6,10),
       (6,11),
       (6,12),
       (6,13),
       (6,14),
       (6,15),
       (6,16),
       (6,17),
       (6,18),
       (6,19),
       (6,20),
       (6,21),
       (6,22),
       (6,23),
       (6,24),
       (6,25),
       (6,26),
       (6,27),
       (6,28),
       (6,29),
       (6,30),
       (6,31),
       (6,32),
       (6,33),
       (6,34),
       (6,35),
       (6,36),
       (6,37),
       (7,1),
       (7,2),
       (7,3),
       (7,4),
       (7,5),
       (7,6),
       (7,7),
       (7,8),
       (7,9),
       (7,10),
       (7,11),
       (7,12),
       (7,13),
       (7,14),
       (7,15),
       (7,16),
       (7,17),
       (7,18),
       (7,19),
       (7,20),
       (7,21),
       (7,22),
       (7,23),
       (7,24),
       (7,25),
       (7,26),
       (7,27),
       (7,28),
       (7,29),
       (7,30),
       (7,31),
       (7,32),
       (7,33),
       (7,34),
       (7,35),
       (7,36),
       (7,37),
       (8,1),
       (8,2),
       (8,3),
       (8,4),
       (8,5),
       (8,6),
       (8,7),
       (8,8),
       (8,9),
       (8,10),
       (8,11),
       (8,12),
       (8,13),
       (8,14),
       (8,15),
       (8,16),
       (8,17),
       (8,18),
       (8,19),
       (8,20),
       (8,21),
       (8,22),
       (8,23),
       (8,24),
       (8,25),
       (8,26),
       (8,27),
       (8,28),
       (8,29),
       (8,30),
       (8,31),
       (8,32),
       (8,33),
       (8,34),
       (8,35),
       (8,36),
       (8,37),
       (9,1),
       (9,2),
       (9,3),
       (9,4),
       (9,5),
       (9,6),
       (9,7),
       (9,8),
       (9,9),
       (9,10),
       (9,11),
       (9,12),
       (9,13),
       (9,14),
       (9,15),
       (9,16),
       (9,17),
       (9,18),
       (9,19),
       (9,20),
       (9,21),
       (9,22),
       (9,23),
       (9,24),
       (9,25),
       (9,26),
       (9,27),
       (9,28),
       (9,29),
       (9,30),
       (9,31),
       (9,32),
       (9,33),
       (9,34),
       (9,35),
       (9,36),
       (9,37);

INSERT INTO t_movie_genre (genre_id, movie_id)
VALUES (6,7),
       (8,7),
       (5,2),
       (10,2),
       (8,3),
       (1,3),
       (11,3),
       (1,1),
       (3,1),
       (5,1),
       (12,4),
       (7,5),
       (8,5),
       (9,6);

INSERT INTO t_movie_country (country_id, movie_id)
VALUES (1,7),
       (2,2),
       (1,3),
       (2,1),
       (1,4),
       (2,5),
       (10,5),
       (2,6);

INSERT INTO t_movie_cast (movie_id, person_id, person_role_id)
VALUES (1, 1, 2),
       (1, 2, 2),
       (1, 3, 2),
       (1, 4, 2),
       (1, 5, 2),
       (1, 6, 1),
       (2, 2, 2),
       (2, 7, 2),
       (2, 8, 2),
       (2, 9, 2),
       (2, 10, 1),
       (3, 1, 2),
       (3, 11, 2),
       (3, 4, 2),
       (3, 8, 2),
       (3, 15, 1),
       (4, 22, 2),
       (4, 23, 2),
       (4, 24, 2),
       (4, 15, 2),
       (4, 16, 1),
       (5, 2, 2),
       (5, 3, 2),
       (5, 4, 2),
       (5, 5, 2),
       (5, 6, 1),
       (6, 12, 2),
       (6, 13, 2),
       (6, 14, 2),
       (6, 15, 2),
       (6, 16, 1),
       (7, 18, 2),
       (7, 19, 2),
       (7, 20, 2),
       (7, 10, 2),
       (7, 14, 1);

INSERT INTO t_session (movie_id, cinema_id, hall_id, starts_at)
VALUES (1, 1, 1, '2024-03-30T10:20'),
       (6, 3, 8, '2024-04-28T21:15'),
       (4, 3, 9, '2024-04-04T10:26'),
       (4, 1, 1, '2024-04-02T20:26'),
       (6, 2, 4, '2024-04-25T12:13'),
       (5, 2, 4, '2024-04-25T14:39'),
       (2, 2, 4, '2024-04-30T10:31'),
       (3, 3, 7, '2024-04-21T17:53'),
       (4, 1, 3, '2024-04-25T11:22'),
       (7, 2, 6, '2024-04-10T20:32'),
       (5, 3, 7, '2024-04-30T15:48'),
       (2, 2, 6, '2024-04-29T19:19'),
       (2, 1, 1, '2024-04-15T16:14'),
       (7, 1, 1, '2024-04-20T13:22'),
       (4, 3, 7, '2024-04-08T13:19'),
       (2, 2, 5, '2024-04-21T15:09'),
       (7, 3, 9, '2024-04-22T13:33'),
       (2, 1, 2, '2024-04-26T18:13'),
       (1, 3, 7, '2024-04-03T11:56'),
       (4, 2, 4, '2024-04-29T13:30'),
       (3, 1, 1, '2024-04-23T11:58'),
       (3, 1, 2, '2024-04-30T13:25'),
       (3, 1, 1, '2024-04-10T19:35'),
       (4, 1, 3, '2024-04-08T15:40'),
       (6, 3, 9, '2024-04-26T13:05'),
       (1, 3, 8, '2024-04-08T20:05'),
       (2, 2, 4, '2024-04-27T11:08'),
       (2, 1, 1, '2024-04-19T20:16'),
       (1, 3, 9, '2024-04-05T21:13'),
       (2, 2, 6, '2024-04-07T13:30'),
       (1, 1, 1, '2024-04-02T14:52'),
       (7, 3, 7, '2024-04-15T19:08'),
       (4, 1, 1, '2024-04-03T10:41'),
       (6, 1, 3, '2024-04-26T20:52'),
       (1, 1, 1, '2024-04-09T21:40'),
       (3, 2, 5, '2024-04-14T10:51'),
       (6, 2, 6, '2024-04-07T18:29'),
       (1, 3, 7, '2024-04-05T21:07'),
       (7, 1, 1, '2024-04-27T20:00'),
       (3, 1, 1, '2024-04-27T20:11'),
       (3, 3, 9, '2024-04-17T16:28'),
       (4, 1, 1, '2024-04-14T20:21'),
       (5, 2, 6, '2024-04-12T11:03'),
       (5, 1, 2, '2024-04-21T19:28'),
       (4, 1, 3, '2024-04-17T19:55'),
       (5, 1, 1, '2024-04-17T19:09'),
       (2, 1, 1, '2024-04-13T14:24'),
       (7, 3, 8, '2024-04-04T19:45'),
       (5, 1, 3, '2024-04-03T16:19'),
       (2, 2, 4, '2024-04-04T21:24'),
       (2, 2, 6, '2024-04-20T18:14'),
       (7, 3, 7, '2024-04-08T10:24'),
       (7, 2, 6, '2024-04-22T19:45'),
       (4, 3, 8, '2024-04-20T18:45'),
       (6, 2, 5, '2024-04-03T21:54'),
       (2, 2, 5, '2024-04-18T11:53'),
       (2, 1, 3, '2024-04-18T11:28'),
       (6, 2, 5, '2024-04-03T20:01'),
       (3, 1, 1, '2024-04-03T11:51'),
       (6, 1, 1, '2024-04-10T16:39'),
       (1, 3, 9, '2024-04-03T15:49'),
       (6, 3, 9, '2024-04-22T13:30'),
       (3, 1, 3, '2024-04-23T16:43'),
       (5, 1, 1, '2024-04-25T20:24'),
       (3, 1, 3, '2024-04-26T10:36'),
       (4, 1, 2, '2024-04-28T11:54'),
       (4, 2, 5, '2024-04-10T12:14'),
       (6, 1, 2, '2024-04-01T18:39'),
       (2, 1, 1, '2024-04-29T12:24'),
       (5, 3, 8, '2024-04-25T12:39'),
       (7, 1, 2, '2024-04-27T12:21'),
       (7, 1, 2, '2024-04-02T20:19'),
       (5, 2, 5, '2024-04-04T19:33'),
       (2, 2, 6, '2024-04-02T20:16'),
       (7, 3, 7, '2024-04-24T11:55'),
       (5, 1, 3, '2024-04-21T10:57'),
       (4, 2, 4, '2024-04-27T20:18'),
       (2, 1, 3, '2024-04-16T10:37'),
       (3, 3, 8, '2024-04-22T14:14'),
       (6, 3, 9, '2024-04-15T17:12'),
       (2, 3, 8, '2024-04-06T20:48'),
       (4, 3, 9, '2024-04-30T15:46'),
       (4, 2, 6, '2024-04-15T20:45'),
       (5, 2, 4, '2024-04-24T13:43'),
       (6, 2, 4, '2024-04-27T12:23'),
       (6, 3, 8, '2024-04-13T18:26'),
       (7, 2, 5, '2024-04-05T19:13'),
       (7, 2, 5, '2024-04-02T21:50'),
       (3, 1, 1, '2024-04-14T10:31'),
       (5, 2, 5, '2024-04-10T20:07'),
       (3, 1, 1, '2024-04-07T10:51'),
       (6, 3, 7, '2024-04-22T13:41'),
       (5, 3, 9, '2024-04-20T18:31'),
       (5, 1, 3, '2024-04-22T10:15'),
       (3, 2, 4, '2024-04-07T14:35'),
       (2, 3, 9, '2024-04-06T11:51'),
       (3, 2, 6, '2024-04-30T14:42'),
       (5, 1, 1, '2024-04-20T14:38'),
       (4, 1, 1, '2024-04-13T18:54'),
       (6, 1, 1, '2024-04-18T16:27'),
       (4, 1, 3, '2024-04-12T19:17'),
       (3, 2, 4, '2024-04-26T10:18'),
       (1, 2, 5, '2024-04-24T19:43'),
       (7, 2, 4, '2024-04-10T11:16'),
       (4, 3, 7, '2024-04-23T15:13'),
       (6, 1, 2, '2024-04-27T16:52'),
       (6, 3, 7, '2024-04-11T13:11'),
       (5, 3, 7, '2024-04-27T11:05'),
       (3, 2, 4, '2024-04-25T18:56'),
       (5, 3, 8, '2024-04-12T17:59'),
       (7, 1, 1, '2024-04-08T17:32'),
       (2, 1, 2, '2024-04-25T10:56'),
       (6, 2, 5, '2024-04-28T13:43'),
       (3, 1, 3, '2024-04-23T15:56'),
       (3, 3, 7, '2024-04-23T14:12'),
       (7, 2, 6, '2024-04-03T14:09'),
       (1, 1, 1, '2024-04-09T10:32'),
       (3, 2, 4, '2024-04-28T19:46'),
       (4, 2, 5, '2024-04-17T20:26'),
       (5, 3, 7, '2024-04-15T12:54'),
       (3, 2, 4, '2024-04-10T18:04'),
       (4, 2, 4, '2024-04-01T12:22'),
       (1, 2, 4, '2024-04-24T16:08'),
       (2, 3, 7, '2024-04-10T13:31'),
       (2, 1, 1, '2024-04-14T18:52'),
       (4, 1, 2, '2024-04-06T19:37'),
       (6, 1, 2, '2024-04-25T11:04'),
       (2, 3, 8, '2024-04-03T17:06'),
       (2, 2, 6, '2024-04-13T20:51'),
       (6, 1, 3, '2024-04-04T21:32'),
       (5, 3, 7, '2024-04-27T19:09'),
       (1, 2, 5, '2024-04-16T20:15'),
       (5, 2, 5, '2024-04-21T20:13'),
       (6, 3, 8, '2024-04-12T21:02'),
       (7, 2, 6, '2024-04-15T18:54'),
       (6, 1, 2, '2024-04-08T12:40'),
       (2, 3, 9, '2024-04-17T16:04'),
       (3, 3, 8, '2024-04-24T20:18'),
       (3, 1, 2, '2024-04-18T11:12'),
       (7, 1, 3, '2024-04-24T13:33'),
       (5, 3, 7, '2024-04-21T12:16'),
       (7, 3, 8, '2024-04-03T16:46'),
       (3, 3, 9, '2024-04-01T19:03'),
       (1, 2, 5, '2024-04-28T20:31'),
       (2, 2, 5, '2024-04-04T15:45'),
       (5, 2, 5, '2024-04-01T18:21'),
       (7, 3, 9, '2024-04-13T14:41'),
       (1, 2, 4, '2024-04-30T14:35'),
       (2, 3, 9, '2024-04-13T17:19'),
       (3, 3, 7, '2024-04-22T12:39'),
       (7, 3, 9, '2024-04-23T20:23'),
       (3, 2, 4, '2024-04-18T10:10'),
       (7, 2, 6, '2024-04-17T20:52'),
       (3, 3, 9, '2024-04-01T16:43'),
       (5, 3, 8, '2024-04-03T14:37'),
       (6, 2, 6, '2024-04-17T15:05'),
       (4, 2, 5, '2024-04-11T20:28'),
       (3, 3, 9, '2024-04-18T20:22'),
       (6, 1, 2, '2024-04-05T11:33'),
       (1, 2, 5, '2024-04-07T12:33'),
       (2, 3, 7, '2024-04-04T11:22'),
       (4, 3, 7, '2024-04-25T12:51'),
       (6, 1, 1, '2024-04-29T11:14'),
       (1, 2, 4, '2024-04-07T11:07'),
       (1, 2, 4, '2024-04-22T18:51'),
       (2, 2, 4, '2024-04-30T20:00'),
       (1, 1, 2, '2024-04-01T16:53'),
       (7, 3, 7, '2024-04-30T11:56'),
       (7, 3, 8, '2024-04-07T18:21'),
       (3, 3, 8, '2024-04-12T16:42'),
       (1, 1, 2, '2024-04-29T16:34'),
       (6, 2, 5, '2024-04-16T10:32'),
       (6, 3, 7, '2024-04-28T20:35'),
       (7, 3, 8, '2024-04-30T15:36'),
       (6, 3, 7, '2024-04-01T21:06'),
       (6, 1, 1, '2024-04-19T13:13'),
       (6, 2, 4, '2024-04-18T15:42'),
       (1, 2, 5, '2024-04-15T13:31'),
       (1, 2, 5, '2024-04-01T14:29'),
       (4, 1, 3, '2024-04-20T11:44'),
       (1, 2, 4, '2024-04-08T13:53'),
       (7, 2, 6, '2024-04-04T21:49'),
       (7, 1, 1, '2024-04-08T20:52'),
       (5, 3, 9, '2024-04-02T10:21'),
       (5, 3, 7, '2024-04-08T11:18'),
       (7, 1, 2, '2024-04-03T20:01'),
       (6, 3, 7, '2024-04-19T10:31'),
       (6, 3, 8, '2024-04-17T19:02'),
       (2, 1, 1, '2024-04-06T14:43'),
       (3, 1, 1, '2024-04-03T17:04'),
       (6, 1, 2, '2024-04-10T14:51'),
       (2, 1, 3, '2024-04-12T14:36'),
       (6, 1, 2, '2024-04-18T15:52'),
       (4, 2, 5, '2024-04-06T20:36'),
       (6, 1, 1, '2024-04-12T10:43'),
       (5, 2, 4, '2024-04-16T15:26'),
       (4, 3, 7, '2024-04-20T21:04'),
       (5, 1, 1, '2024-04-01T15:43'),
       (3, 3, 7, '2024-04-04T13:49'),
       (5, 1, 1, '2024-04-24T16:07'),
       (7, 1, 1, '2024-04-29T21:08'),
       (4, 1, 1, '2024-04-27T21:19'),
       (4, 2, 4, '2024-04-23T12:16'),
       (2, 1, 3, '2024-04-25T10:59'),
       (4, 1, 2, '2024-04-22T14:29'),
       (7, 2, 5, '2024-04-06T14:58'),
       (4, 3, 7, '2024-04-20T14:27'),
       (1, 3, 9, '2024-04-03T15:52'),
       (4, 2, 5, '2024-04-29T19:33'),
       (1, 2, 5, '2024-04-12T21:30'),
       (5, 1, 3, '2024-04-12T17:39'),
       (7, 3, 7, '2024-04-02T11:29'),
       (4, 2, 6, '2024-04-25T19:01'),
       (5, 3, 9, '2024-04-09T11:17'),
       (2, 1, 1, '2024-04-17T10:59'),
       (2, 2, 6, '2024-04-11T20:49'),
       (6, 2, 5, '2024-04-09T14:39'),
       (3, 2, 5, '2024-04-20T17:37'),
       (7, 2, 5, '2024-04-09T10:38'),
       (5, 2, 6, '2024-04-15T13:47'),
       (1, 3, 9, '2024-04-22T18:16'),
       (5, 3, 9, '2024-04-10T10:47'),
       (6, 1, 2, '2024-04-11T16:37'),
       (7, 1, 2, '2024-04-25T21:58'),
       (5, 2, 6, '2024-04-18T20:53'),
       (2, 1, 1, '2024-04-15T15:34'),
       (3, 3, 8, '2024-04-11T17:21'),
       (4, 3, 8, '2024-04-16T14:49'),
       (4, 1, 1, '2024-04-26T20:24'),
       (3, 2, 6, '2024-04-14T15:20'),
       (7, 1, 1, '2024-04-15T21:42'),
       (7, 3, 7, '2024-04-08T11:46'),
       (4, 3, 7, '2024-04-01T10:31'),
       (3, 3, 9, '2024-04-30T13:02'),
       (7, 1, 2, '2024-04-23T15:47'),
       (5, 2, 4, '2024-04-21T15:34'),
       (1, 1, 2, '2024-04-19T20:02'),
       (7, 2, 5, '2024-04-11T17:19'),
       (4, 1, 1, '2024-04-16T13:23'),
       (6, 1, 1, '2024-04-04T20:05'),
       (1, 1, 3, '2024-04-28T13:35'),
       (3, 2, 5, '2024-04-29T20:20'),
       (3, 1, 1, '2024-04-05T10:05'),
       (4, 1, 2, '2024-04-06T13:05'),
       (4, 2, 5, '2024-04-28T21:32'),
       (7, 3, 7, '2024-04-07T20:47'),
       (3, 3, 7, '2024-04-11T20:46'),
       (4, 3, 8, '2024-04-26T13:11'),
       (7, 2, 5, '2024-04-27T15:47'),
       (1, 2, 5, '2024-04-24T10:59'),
       (6, 1, 1, '2024-04-29T12:21'),
       (7, 3, 8, '2024-04-28T18:47'),
       (5, 1, 2, '2024-04-09T19:55'),
       (5, 2, 6, '2024-04-08T16:20'),
       (1, 1, 2, '2024-04-05T17:36'),
       (1, 1, 1, '2024-04-01T11:43'),
       (5, 3, 8, '2024-04-08T10:16'),
       (7, 3, 8, '2024-04-03T19:51'),
       (2, 1, 1, '2024-04-30T10:27'),
       (4, 2, 4, '2024-04-20T19:59'),
       (2, 3, 9, '2024-04-24T18:46'),
       (6, 2, 6, '2024-04-14T10:38'),
       (3, 1, 3, '2024-04-23T20:39'),
       (4, 2, 6, '2024-04-06T21:29'),
       (6, 2, 4, '2024-04-22T11:16'),
       (5, 3, 8, '2024-04-06T10:27'),
       (6, 2, 5, '2024-04-11T17:31'),
       (4, 2, 6, '2024-04-25T18:48'),
       (5, 3, 8, '2024-04-19T15:45'),
       (6, 2, 4, '2024-04-16T17:24'),
       (1, 3, 8, '2024-04-09T16:37'),
       (1, 3, 8, '2024-04-21T11:15'),
       (7, 3, 8, '2024-04-04T20:40'),
       (2, 1, 3, '2024-04-17T16:27'),
       (2, 3, 7, '2024-04-07T19:08'),
       (6, 3, 9, '2024-04-11T17:02'),
       (1, 1, 2, '2024-04-14T21:46'),
       (6, 1, 2, '2024-04-26T21:14'),
       (5, 1, 1, '2024-04-18T16:33'),
       (1, 3, 9, '2024-04-06T15:34'),
       (7, 1, 3, '2024-04-07T17:33'),
       (1, 3, 7, '2024-04-18T14:50'),
       (4, 1, 3, '2024-04-06T14:53'),
       (1, 2, 6, '2024-04-19T16:11'),
       (3, 3, 7, '2024-04-18T17:02'),
       (2, 2, 6, '2024-04-04T21:43'),
       (4, 1, 3, '2024-04-27T14:28'),
       (3, 3, 7, '2024-04-15T11:13'),
       (2, 3, 8, '2024-04-27T21:06'),
       (5, 1, 3, '2024-04-05T15:16'),
       (7, 2, 4, '2024-04-08T15:30'),
       (5, 3, 9, '2024-04-09T14:53'),
       (1, 1, 3, '2024-04-07T16:39'),
       (4, 3, 9, '2024-04-15T18:43'),
       (7, 1, 2, '2024-04-23T14:49'),
       (1, 3, 9, '2024-04-11T20:03'),
       (2, 1, 2, '2024-04-12T10:27'),
       (1, 1, 1, '2024-04-09T11:33'),
       (4, 3, 7, '2024-04-08T11:23'),
       (7, 3, 9, '2024-04-10T12:42'),
       (2, 1, 1, '2024-04-22T16:50');

INSERT INTO t_price (session_id, place_type_id, price)
VALUES (1, 1, 200.00),
       (1, 2, 500.00),
       (1, 3, 300.00),
       (1, 4, 4000.00),
       (2, 1, 200.00),
       (2, 2, 500.00),
       (2, 3, 300.00),
       (2, 4, 4000.00),
       (3, 1, 200.00),
       (3, 2, 500.00),
       (3, 3, 300.00),
       (3, 4, 4000.00),
       (4, 1, 200.00),
       (4, 2, 500.00),
       (4, 3, 300.00),
       (4, 4, 4000.00),
       (5, 1, 200.00),
       (5, 2, 500.00),
       (5, 3, 300.00),
       (5, 4, 4000.00),
       (6, 1, 200.00),
       (6, 2, 500.00),
       (6, 3, 300.00),
       (6, 4, 4000.00),
       (7, 1, 200.00),
       (7, 2, 500.00),
       (7, 3, 300.00),
       (7, 4, 4000.00),
       (8, 1, 200.00),
       (8, 2, 500.00),
       (8, 3, 300.00),
       (8, 4, 4000.00),
       (9, 1, 200.00),
       (9, 2, 500.00),
       (9, 3, 300.00),
       (9, 4, 4000.00),
       (10, 1, 200.00),
       (10, 2, 500.00),
       (10, 3, 300.00),
       (10, 4, 4000.00),
       (11, 1, 200.00),
       (11, 2, 500.00),
       (11, 3, 300.00),
       (11, 4, 4000.00),
       (12, 1, 200.00),
       (12, 2, 500.00),
       (12, 3, 300.00),
       (12, 4, 4000.00),
       (13, 1, 200.00),
       (13, 2, 500.00),
       (13, 3, 300.00),
       (13, 4, 4000.00),
       (14, 1, 200.00),
       (14, 2, 500.00),
       (14, 3, 300.00),
       (14, 4, 4000.00),
       (15, 1, 200.00),
       (15, 2, 500.00),
       (15, 3, 300.00),
       (15, 4, 4000.00),
       (16, 1, 200.00),
       (16, 2, 500.00),
       (16, 3, 300.00),
       (16, 4, 4000.00),
       (17, 1, 200.00),
       (17, 2, 500.00),
       (17, 3, 300.00),
       (17, 4, 4000.00),
       (18, 1, 200.00),
       (18, 2, 500.00),
       (18, 3, 300.00),
       (18, 4, 4000.00),
       (19, 1, 200.00),
       (19, 2, 500.00),
       (19, 3, 300.00),
       (19, 4, 4000.00),
       (20, 1, 200.00),
       (20, 2, 500.00),
       (20, 3, 300.00),
       (20, 4, 4000.00),
       (21, 1, 200.00),
       (21, 2, 500.00),
       (21, 3, 300.00),
       (21, 4, 4000.00),
       (22, 1, 200.00),
       (22, 2, 500.00),
       (22, 3, 300.00),
       (22, 4, 4000.00),
       (23, 1, 200.00),
       (23, 2, 500.00),
       (23, 3, 300.00),
       (23, 4, 4000.00),
       (24, 1, 200.00),
       (24, 2, 500.00),
       (24, 3, 300.00),
       (24, 4, 4000.00),
       (25, 1, 200.00),
       (25, 2, 500.00),
       (25, 3, 300.00),
       (25, 4, 4000.00);