ALTER TABLE public.event
    ADD city VARCHAR(255);

ALTER TABLE public.event
    ADD description VARCHAR(255);

ALTER TABLE public.event
    ADD uf VARCHAR(255);

ALTER TABLE public.event
    DROP COLUMN descripcion;

DROP SEQUENCE public.address_seq CASCADE;

DROP SEQUENCE public.coupon_seq CASCADE;