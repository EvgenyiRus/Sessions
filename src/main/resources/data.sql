INSERT INTO USERS (LOGIN, PASSWORD)
VALUES ('Roza Hutor', '{noop}roza'),
       ('Cris Button', '{noop}cris'),
       ('Fray Tynnig', '{noop}fray');

INSERT INTO USER_ROLES (USER_ID,ROLE)
VALUES (1, 'USER'),
       (2, 'ADMIN'),
       (3, 'USER'),
       (3, 'ADMIN');