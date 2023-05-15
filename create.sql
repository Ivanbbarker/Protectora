-- Active: 1683727825169@@127.0.0.1@3306@protectora


    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal integer not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id integer not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal integer not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id integer not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal integer not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id integer not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal integer not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id integer not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal integer not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id integer not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal integer not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id integer not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal integer not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id integer not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal integer not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id integer not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal varchar(255) not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id varchar(255) not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal varchar(255) not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id varchar(255) not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal varchar(255) not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id varchar(255) not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal varchar(255) not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id varchar(255) not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal varchar(255) not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id varchar(255) not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal varchar(255) not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id varchar(255) not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal varchar(255) not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id varchar(255) not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal varchar(255) not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id varchar(255) not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    create table adoption (
       id_adoption integer not null auto_increment,
        city varchar(255),
        conset bit,
        country varchar(255),
        postal_code integer,
        tax double precision,
        date_adoption datetime(6),
        id_adopters BINARY(16) not null,
        id_animal varchar(255) not null,
        id_employee BINARY(16) not null,
        primary key (id_adoption)
    ) engine=InnoDB;

    create table animals (
       id varchar(255) not null auto_increment,
        date_of_entry datetime(6),
        departure_date datetime(6),
        height double precision,
        name varchar(255),
        phatology varchar(255),
        weight double precision,
        id_kingdom integer not null,
        id_race integer not null,
        primary key (id)
    ) engine=InnoDB;

    create table kingdom (
       id_kingdom integer not null auto_increment,
        name varchar(255),
        icon varchar(255),
        primary key (id_kingdom)
    ) engine=InnoDB;

    create table race (
       id_race integer not null auto_increment,
        name varchar(255),
        id_kingdom integer not null,
        primary key (id_race)
    ) engine=InnoDB;

    create table users (
       id BINARY(16) not null,
        email varchar(255),
        active bit,
        address varchar(255),
        birth_date date,
        city varchar(255),
        consent bit,
        country varchar(255),
        created_at datetime(6),
        date_consent datetime(6),
        dni varchar(255),
        height double precision,
        job_function varchar(255),
        name varchar(255),
        password varchar(255),
        phone integer,
        postal_code integer,
        role varchar(255),
        specialization varchar(255),
        surname varchar(255),
        weigth double precision,
        primary key (id)
    ) engine=InnoDB;

    alter table adoption 
       add constraint FK6kaa4n0fpj2rdwwe3ahevn271 
       foreign key (id_adopters) 
       references users (id);

    alter table adoption 
       add constraint FK8171lyx16hdx69pu3k28wqf31 
       foreign key (id_animal) 
       references animals (id);

    alter table adoption 
       add constraint FKbd9qdbj1rnybi12nienesatm9 
       foreign key (id_employee) 
       references users (id);

    alter table animals 
       add constraint FK7d40t14rmk4iuhunxcrh5brq4 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);

    alter table animals 
       add constraint FKc5p071h6oifwp7i2h1xj1kp06 
       foreign key (id_race) 
       references race (id_race);

    alter table race 
       add constraint FKh3hx38k847yx52ado6uc7iavi 
       foreign key (id_kingdom) 
       references kingdom (id_kingdom);
