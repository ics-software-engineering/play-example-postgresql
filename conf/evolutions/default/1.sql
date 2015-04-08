# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table page_retrieval (
  id                        bigint not null,
  timestamp                 bigint,
  constraint pk_page_retrieval primary key (id))
;

create sequence page_retrieval_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists page_retrieval;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists page_retrieval_seq;

