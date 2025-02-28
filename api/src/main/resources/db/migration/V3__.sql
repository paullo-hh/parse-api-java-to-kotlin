CREATE SEQUENCE IF NOT EXISTS coupon_seq START WITH 1 INCREMENT BY 50;

CREATE TABLE coupon
(
    id       BIGINT NOT NULL,
    valid    TIMESTAMP WITHOUT TIME ZONE,
    discount INTEGER,
    code     VARCHAR(255),
    event_id BIGINT,
    CONSTRAINT pk_coupon PRIMARY KEY (id)
);