-- members
INSERT INTO members VALUES (1, '이소은','010-1234-5678');
INSERT INTO members VALUES (2, '최지희', '010-1235-6789');
INSERT INTO members VALUES (3, '최성민', '010-2345-8894');
INSERT INTO members VALUES (4, '피카츄', '010-7272-7272');
INSERT INTO members VALUES (5, '파이리', '010-8282-8282');
INSERT INTO members VALUES (6, '꼬부기', '010-5959-5959');
INSERT INTO members VALUES (7, '이상해씨', '010-2222-2222');

COMMIT;

-- item
INSERT INTO item VALUES (8809320938893, '엔젤스코튼 너리싱 핸드크림', '더프트앤도프트', 5000, 1000 );
INSERT INTO item VALUES (8801067085601, '네임펜 Black', '모나미', 700, 500 );
INSERT INTO item VALUES (3661434000683, '스틱레브르 오리지널', '유리아쥬', 12000, 300 );
INSERT INTO item VALUES (8809612864084, '그린티 퓨어 젤 핸드크림', '이니스프리', 3500, 400 );
INSERT INTO item VALUES (4826293487232, '화이트 치즈', '알라 아페티나', 6400, 550 );
INSERT INTO item VALUES (1034583945797, '태국 소고기 쌀국수', '소이연남', 6750, 220 );
INSERT INTO item VALUES (6293734836583, '마제소바', '멘야하나비', 13990, 1100 );
INSERT INTO item VALUES (5464552544332, '플레이스테이션5', 'SONY', 628000, 700 );
INSERT INTO item VALUES (7676634525356, '청소기 2종 C01B', '발뮤다', 459000, 990 );
INSERT INTO item VALUES (5734525745345, '뉴질랜드 점보 썬골드키위', '제스프리', 9900, 800 );
INSERT INTO item VALUES (4543536235677, '갈비탕', '사미헌', 12000, 884 );
INSERT INTO item VALUES (8753135432188, '짬뽕 2인분', '이연복의 목란', 12936, 400 );
INSERT INTO item VALUES (9618735486153, '부추 꼬막 비빔장', '연안식당', 6900, 1000 );
INSERT INTO item VALUES (4435483218765, '칼국수', '전주 베테랑', 5040, 990 );
INSERT INTO item VALUES (3658751156874, '옛날 소 불고', '숭의가든', 14400, 355 );
INSERT INTO item VALUES (4865464654378, '속초식 명태 회냉면', '올면', 11800, 660 );
INSERT INTO item VALUES (2948574873652, '김치 우동 전골', '고래사어묵', 9768, 553 );
INSERT INTO item VALUES (8979654577887, '대구막창', '미트클레버', 17100, 999 );
INSERT INTO item VALUES (1657867546878, '쌀 떡볶이', '금미옥', 4845, 546 );

COMMIT;

-- order
INSERT INTO orders VALUES (10000, 1, NOW());
INSERT INTO orders VALUES (10001, 2, NOW());
INSERT INTO orders VALUES (10002, 3, NOW());
INSERT INTO orders VALUES (10003, 4, NOW());
INSERT INTO orders VALUES (10004, 5, NOW());
INSERT INTO orders VALUES (10005, 6, NOW());
INSERT INTO orders VALUES (10006, 7, NOW());

COMMIT;

-- order_item
INSERT INTO order_item VALUES(22544, 10000, 8809320938893, 1);
INSERT INTO order_item VALUES(22545, 10000, 7676634525356, 2);
INSERT INTO order_item VALUES(22546, 10000, 1034583945797, 1);
INSERT INTO order_item VALUES(22547, 10000, 4865464654378, 1);
INSERT INTO order_item VALUES(22548, 10000, 6293734836583, 3);
INSERT INTO order_item VALUES(22549, 10000, 5734525745345, 2);
INSERT INTO order_item VALUES(22550, 10000, 4826293487232, 1);
INSERT INTO order_item VALUES(22551, 10000, 4543536235677, 2);
INSERT INTO order_item VALUES(22552, 10000, 2948574873652, 5);

INSERT INTO order_item VALUES(22553, 10001, 8809320938893, 2);
INSERT INTO order_item VALUES(22554, 10001, 8809612864084, 2);
INSERT INTO order_item VALUES(22555, 10001, 4865464654378, 5);
INSERT INTO order_item VALUES(22556, 10001, 8753135432188, 2);
INSERT INTO order_item VALUES(22557, 10001, 1034583945797, 1);

INSERT INTO order_item VALUES(22558, 10002, 5464552544332, 1);

INSERT INTO order_item VALUES(22559, 10003, 7676634525356, 1);
INSERT INTO order_item VALUES(22560, 10003, 1657867546878, 10);
INSERT INTO order_item VALUES(22561, 10003, 4826293487232, 20);
INSERT INTO order_item VALUES(22562, 10003, 3661434000683, 1);

INSERT INTO order_item VALUES(22563, 10004, 6293734836583, 2);
INSERT INTO order_item VALUES(22564, 10004, 9618735486153, 1);
INSERT INTO order_item VALUES(22565, 10004, 5734525745345, 2);
INSERT INTO order_item VALUES(22566, 10004, 4865464654378, 3);
INSERT INTO order_item VALUES(22567, 10004, 1657867546878, 6);
INSERT INTO order_item VALUES(22568, 10004, 1034583945797, 2);

INSERT INTO order_item VALUES(22569, 10005, 8809612864084, 10);
INSERT INTO order_item VALUES(22570, 10005, 4543536235677, 3);
INSERT INTO order_item VALUES(22571, 10005, 4435483218765, 5);

INSERT INTO order_item VALUES(22572, 10006, 7676634525356, 1);
INSERT INTO order_item VALUES(22573, 10006, 1034583945797, 5);
INSERT INTO order_item VALUES(22574, 10006, 5464552544332, 1);
INSERT INTO order_item VALUES(22575, 10006, 1657867546878, 2);

COMMIT;

-- tracking_info
INSERT INTO tracking_info VALUES('T100000000000', 10000, NOW());
INSERT INTO tracking_info VALUES('T100000000001', 10001, NOW());
INSERT INTO tracking_info VALUES('T100000000002', 10002, NOW());
INSERT INTO tracking_info VALUES('T100000000003', 10003, NOW());
INSERT INTO tracking_info VALUES('T100000000004', 10004, NOW());
INSERT INTO tracking_info VALUES('T100000000005', 10005, NOW());
INSERT INTO tracking_info VALUES('T100000000006', 10006, NOW());

COMMIT;

-- inspect_info
INSERT INTO inspect_info VALUES(1000000000000, 10000, 'T100000000000', 0, null);
INSERT INTO inspect_info VALUES(1000000000001, 10001, 'T100000000001', 0, null);
INSERT INTO inspect_info VALUES(1000000000002, 10002, 'T100000000002', 0, null);
INSERT INTO inspect_info VALUES(1000000000003, 10003, 'T100000000003', 0, null);
INSERT INTO inspect_info VALUES(1000000000004, 10004, 'T100000000004', 0, null);
INSERT INTO inspect_info VALUES(1000000000005, 10005, 'T100000000005', 0, null);
INSERT INTO inspect_info VALUES(1000000000006, 10006, 'T100000000006', 0, null);

COMMIT;
