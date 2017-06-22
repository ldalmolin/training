CREATE DATABASE IF NOT EXISTS Training;

use Training;

CREATE TABLE IF NOT EXISTS person (
	name VARCHAR(32) NOT NULL,
	surname VARCHAR(32) NOT NULL,
    email VARCHAR(32) PRIMARY KEY	
) 

INSERT INTO person (name, surname, email) VALUES
					('mario', 'rossi','mario.rossi@example.it'),
					('maria', 'bianchi','maria.bianchi@example.it')
				