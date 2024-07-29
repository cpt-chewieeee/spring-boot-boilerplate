INSERT INTO USERS(id, username, password, email) values (1, 'admin', 'admin_password', 'ab@ba.com')
ON CONFLICT DO NOTHING;