CREATE TABLE TEAM (
	id integer NOT NULL primary key,
	name varchar(30) not null,
	leader integer NULL,
	leader_name varchar(33) null
);
CREATE TABLE MEMBER (
	id integer not null primary key,
	name varchar(33) not null,
	grade varchar(33) not null,
	team integer not null,
	email varchar(255),
	phone varchar(11),
	work varchar(33)
);
CREATE TABLE GRADE (
	name varchar(33) not null primary key,
	desc varchar(255)
);
insert into GRADE (name, desc)
values ('팀장', '팀장님'),
	('팀원', '팀원들');
insert into TEAM (id, name)
values (1, '플랫폼개발팀');
insert into MEMBER(id, name, grade, team, work)
values (1, '심규웅', '팀장', 1, '팀장'),
	(2, '한국화', '팀원', 1, '백'),
	(3, '임주연', '팀원', 1, '프론트'),
	(4, '김현호', '팀원', 1, '백'),
	(5, '윤수빈', '팀원', 1, '백'),
	(6, '박기홍', '팀원', 1, '백'),
	(7, '이예림', '팀원', 1, '프론트'),
	(8, '강현구', '팀원', 1, '프론트');
update TEAM
set leader = 1,
	leader_name = '심규웅'
where id = 1;