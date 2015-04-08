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

drop table if exists page_retrieval cascade;

drop sequence if exists page_retrieval_seq;

