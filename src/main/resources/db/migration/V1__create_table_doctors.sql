create table doctors(
    id BIGINT auto_increment,
    name VARCHAR(200) NOT NULL UNIQUE,
    email VARCHAR(200) NOT NULL UNIQUE,
    cpf VARCHAR(20) NOT NULL UNIQUE,
    phone VARCHAR(15) NOT NULL UNIQUE,
    created_at TIMESTAMP NULL,
    city VARCHAR(200) NOT NULL,
    street VARCHAR(200) NOT NULL,
    state VARCHAR(200) NOT NULL,
    neighborhood VARCHAR(200) NOT NULL,
    zip_code VARCHAR(9) NOT NULL,
    state_code VARCHAR(2) NOT NULL,
    complement VARCHAR(100),
    number VARCHAR(10),

    PRIMARY KEY(id)
);