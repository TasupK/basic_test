select *
from girl_group;

select count(*)
from song;


/*
 * insert��
 */
insert into girl_group(name,debut,hit_song_id )
values ('',now(),118);

/*
 * update��
 */
update girl_group 
set hit_song_id = 113
where `_id` = 12;

/*
 * delete��
 */
delete from girl_group 
where `_id` = 14;

/*
 * select��
 * 
 * ������ ������ �� ���� ��.
 */
select 
	name 
	,hit_song_id 
from girl_group
where hit_song_id >= 100 and hit_song_id <=107

select 
	name 
	,hit_song_id 
from girl_group
limit 7;

select 
	name 
	,hit_song_id 
from girl_group
where hit_song_id between 101 and 107; 

/*
 * order by ��
 * order by �÷��� ���Ĺ��(desc, asc)
*/
select 
	`_id`
	,name 
	,debut 
	,hit_song_id 
from girl_group
order by debut asc;


select *
from girl_group
where name = '�����ɽ�';

select *
from girl_group gg 
where `_id` = 13;

/*
 * ������ ���� ����("%y %m %d")
 */
select 
`_id` 
,name 
,hit_song_id 
,date_format(debut,"%Y��-%m��-%d��") as debut 
from girl_group gg 

/*
 * like concat() �˻� ���
 * %�ؽ�Ʈ :�� �˻�
 * �ؽ�Ʈ% :�� �˻�
 * %�ؽ�Ʈ% :���� �˻�
 */
select *
from girl_group gg 
where name like concat('%��%');

/*
 * �ߺ� ���� �˻� 
 */
select distinct (name) 
from girl_group ; 


