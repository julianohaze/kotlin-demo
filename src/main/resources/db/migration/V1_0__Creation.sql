CREATE TABLE users (
    id bigint NOT NULL,
   	name character varying(100),
   	email character varying(100),
    CONSTRAINT user_pkey PRIMARY KEY (id)
);

CREATE SEQUENCE users_sequence INCREMENT 1 MINVALUE 1 START 1 CACHE 1;