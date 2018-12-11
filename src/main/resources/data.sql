INSERT INTO `fooditem` (id, description, name, price) VALUES (1, 'God flæsk', 'Flæskesteg', 50);
INSERT INTO `fooditem` (id, description, name, price) VALUES (2, 'Sprød and', 'And', 100);
INSERT INTO `fooditem` (id, description, name, price) VALUES (3, 'Tyk sovs', 'Brun sovs', 20);
INSERT INTO `fooditem` (id, description, name, price) VALUES (4, 'Sukkerkartofler', 'Brune kartofler', 30);
INSERT INTO `fooditem` (id, description, name, price) VALUES (5, 'Dansk produceret', 'Rødkål', 15);

INSERT INTO `menu` (id, description, name, price) VALUES (1, 'Billig men god menu', 'Billig menu', 250);
INSERT INTO `menu` (id, description, name, price) VALUES (2, 'Luksus menu', 'Luksus julemenu', 500);

INSERT INTO `menu_fooditem` (menu_id, fooditem_id) VALUES (1, 1);
INSERT INTO `menu_fooditem` (menu_id, fooditem_id) VALUES (1, 3);
INSERT INTO `menu_fooditem` (menu_id, fooditem_id) VALUES (1, 4);
INSERT INTO `menu_fooditem` (menu_id, fooditem_id) VALUES (1, 5);
INSERT INTO `menu_fooditem` (menu_id, fooditem_id) VALUES (2, 1);
INSERT INTO `menu_fooditem` (menu_id, fooditem_id) VALUES (2, 2);
INSERT INTO `menu_fooditem` (menu_id, fooditem_id) VALUES (2, 3);
INSERT INTO `menu_fooditem` (menu_id, fooditem_id) VALUES (2, 4);
INSERT INTO `menu_fooditem` (menu_id, fooditem_id) VALUES (2, 5);