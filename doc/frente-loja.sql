create table usuario (
	id bigserial,
	nome text not null,
	login text not null,
	senha text not null,
	constraint pk_usuario primary key (id)
);