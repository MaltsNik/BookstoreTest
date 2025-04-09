CREATE TABLE IF NOT EXISTS book
(
    id          BIGSERIAL PRIMARY KEY,
    vendor_code VARCHAR(255)   NOT NULL,
    title       VARCHAR(255)   NOT NULL,
    year        INTEGER,
    brand       VARCHAR(255),
    stock       INTEGER        NOT NULL DEFAULT 0,
    price       NUMERIC(10, 2) NOT NULL
);