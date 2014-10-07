create table usuario (
	id bigserial,
	nome text not null,
	login text not null,
	senha text not null,
	constraint pk_usuario primary key (id)
);

create table cliente (
	id bigserial,
	nome text not null,
	cpf text not null,
	email text,
	telefone text,
	tipo_pessoa text,
	constraint pk_cliente primary key (id)
);