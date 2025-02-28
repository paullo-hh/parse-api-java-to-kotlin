CREATE SEQUENCE IF NOT EXISTS address_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE address
(
    id       BIGINT NOT NULL,
    city     VARCHAR(255),
    uf       VARCHAR(255),
    event_id BIGINT,
    CONSTRAINT pk_address PRIMARY KEY (id)
);