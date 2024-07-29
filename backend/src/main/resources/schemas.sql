
CREATE TABLE IF NOT EXISTS USERS (
    id serial PRIMARY KEY,
    username varchar NOT NULL,
    password varchar NOT NULL
);


CREATE TABLE IF NOT EXISTS STORES (
    id serial PRIMARY KEY,
    name varchar NOT NULL,
    user_id integer REFERENCES USERS(id),
    active boolean DEFAULT TRUE,
    create_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    last_update TIMESTAMP
);