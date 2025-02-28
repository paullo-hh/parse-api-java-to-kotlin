CREATE SEQUENCE IF NOT EXISTS event_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE event
(
    id          BIGINT  NOT NULL,
    title       VARCHAR(255),
    descripcion VARCHAR(255),
    img_url     VARCHAR(255),
    event_url   VARCHAR(255),
    remote      BOOLEAN NOT NULL,
    date        TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_event PRIMARY KEY (id)
);