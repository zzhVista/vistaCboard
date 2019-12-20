
-- Drop table

-- DROP TABLE public.dashboard_board;

CREATE TABLE public.dashboard_board (
	board_id varchar(100) NOT NULL,
	user_id varchar(100) NOT NULL,
	category_id varchar(100) NULL,
	board_name varchar(100) NOT NULL,
	layout_json text NULL,
	create_time timestamp NOT NULL DEFAULT now(),
	update_time timestamp NOT NULL DEFAULT now(),
	CONSTRAINT dashboard_board_pkey PRIMARY KEY (board_id)
);

-- Drop table

-- DROP TABLE public.dashboard_board_param;

CREATE TABLE public.dashboard_board_param (
	board_param_id varchar(100) NOT NULL,
	user_id varchar(100) NOT NULL,
	board_id varchar(100) NOT NULL,
	config text NULL,
	CONSTRAINT dashboard_board_param_pkey PRIMARY KEY (board_param_id)
);

-- Drop table

-- DROP TABLE public.dashboard_category;

CREATE TABLE public.dashboard_category (
	category_id varchar(100) NOT NULL,
	category_name varchar(100) NOT NULL,
	user_id varchar(100) NOT NULL,
	CONSTRAINT dashboard_category_pkey PRIMARY KEY (category_id)
);

-- Drop table

-- DROP TABLE public.dashboard_dataset;

CREATE TABLE public.dashboard_dataset (
	dataset_id varchar(100) NOT NULL,
	user_id varchar(100) NOT NULL,
	category_name varchar(100) NULL,
	dataset_name varchar(100) NULL,
	data_json text NULL,
	create_time timestamp NOT NULL DEFAULT now(),
	update_time timestamp NOT NULL DEFAULT now(),
	CONSTRAINT dashboard_dataset_pkey PRIMARY KEY (dataset_id)
);

-- Drop table

-- DROP TABLE public.dashboard_datasource;

CREATE TABLE public.dashboard_datasource (
	datasource_id varchar(100) NOT NULL,
	user_id varchar(100) NOT NULL,
	source_name varchar(100) NOT NULL,
	source_type varchar(100) NOT NULL,
	config text NULL,
	create_time timestamp NOT NULL DEFAULT now(),
	update_time timestamp NOT NULL DEFAULT now(),
	CONSTRAINT dashboard_datasource_pkey PRIMARY KEY (datasource_id)
);

-- Drop table

-- DROP TABLE public.dashboard_homepage;

CREATE TABLE public.dashboard_homepage (
	user_id varchar(50) NOT NULL,
	board_id varchar NULL
);

-- Drop table

-- DROP TABLE public.dashboard_job;

CREATE TABLE public.dashboard_job (
	job_id varchar(100) NOT NULL,
	job_name varchar(200) NULL,
	cron_exp varchar(200) NULL,
	start_date timestamp NULL,
	end_date timestamp NULL,
	job_type varchar(200) NULL,
	job_config text NULL,
	user_id varchar(100) NULL,
	last_exec_time timestamp NULL,
	job_status int4 NULL,
	exec_log text NULL,
	CONSTRAINT dashboard_job_pkey PRIMARY KEY (job_id)
);

-- Drop table

-- DROP TABLE public.dashboard_role;

CREATE TABLE public.dashboard_role (
	role_id varchar(100) NOT NULL,
	role_name varchar(100) NULL,
	user_id varchar(100) NULL,
	CONSTRAINT dashboard_role_pkey PRIMARY KEY (role_id)
);

-- Drop table

-- DROP TABLE public.dashboard_role_res;

CREATE TABLE public.dashboard_role_res (
	role_res_id varchar(100) NOT NULL,
	role_id varchar(100) NULL,
	res_type varchar(100) NULL,
	res_id varchar(100) NULL,
	"permission" varchar(20) NULL,
	CONSTRAINT dashboard_role_res_pkey PRIMARY KEY (role_res_id)
);

-- Drop table

-- DROP TABLE public.dashboard_user;

CREATE TABLE public.dashboard_user (
	user_id varchar(100) NOT NULL,
	login_name varchar(100) NULL,
	user_name varchar(100) NULL,
	user_password varchar(100) NULL,
	user_status varchar(100) NULL,
	org_name varchar(100) NULL,
	CONSTRAINT dashboard_user_pkey PRIMARY KEY (user_id),
	CONSTRAINT uk_dashboard_user_login_name UNIQUE (login_name)
);

-- Drop table

-- DROP TABLE public.dashboard_user_role;

CREATE TABLE public.dashboard_user_role (
	user_role_id varchar(100) NOT NULL,
	user_id varchar(100) NULL,
	role_id varchar(100) NULL,
	CONSTRAINT dashboard_user_role_pkey PRIMARY KEY (user_role_id)
);

-- Drop table

-- DROP TABLE public.dashboard_widget;

CREATE TABLE public.dashboard_widget (
	widget_id varchar(100) NOT NULL,
	user_id varchar(100) NOT NULL,
	category_name varchar(100) NULL,
	widget_name varchar(100) NULL,
	data_json text NULL,
	create_time timestamp NOT NULL DEFAULT now(),
	update_time timestamp NOT NULL DEFAULT now(),
	CONSTRAINT dashboard_widget_pkey PRIMARY KEY (widget_id)
);
