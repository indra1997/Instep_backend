

DROP TABLE IF EXISTS candidate;
DROP TABLE IF EXISTS mentor;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS admin;


create table candidate(
   candidate_id int auto_increment,
	email_id varchar(50),
	alternate_email varchar(50),
	name varchar (50),
	mobile varchar (20),
	alternate_mobile varchar (20),
	work_auth_country varchar (20),
	internship_location varchar (50),
	geo_region varchar (50),
	academic_level varchar (20),
	academic_year int,
	cgpa int,
	academic_concentration varchar (20),
	expected_graduation_date date,
	key_skills varchar (50),
	area_of_interest varchar (50),
	project_preference varchar (50),
   constraint ps_candidate_id_pk primary key (candidate_id)
);




create table mentor(
   mentor_id int auto_increment,
   name varchar(20),
   password varchar(50),
   email_id varchar(50),
   location varchar(50),
   unit varchar(50),
   no_of_projects_mentoring int,
   constraint ps_mentor_id_pk primary key (mentor_id)
);




create table project(
   project_id int auto_increment,
   title varchar(20),
   description varchar(50),
   required_skills varchar(50),
   location varchar(50),
   status varchar(50),
   mentor_id int ,
   mentors_allocated int,
   constraint ps_project_id_pk primary key (project_id)
);



create table admin(
   admin_id int auto_increment,
   name varchar(20),
   password varchar(50),
   constraint ps_admin_id_pk primary key (admin_id)
);




commit;
select * from candidate;