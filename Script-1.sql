select *
from girl_group;

select count(*)
from song;


/*
 * insert문
 */
insert into girl_group(name,debut,hit_song_id )
values ('',now(),118);

/*
 * update문
 */
update girl_group 
set hit_song_id = 113
where `_id` = 12;

/*
 * delete문
 */
delete from girl_group 
where `_id` = 14;

/*
 * select문
 * 
 * 범위를 지정할 때 쓰는 법.
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
 * order by 문
 * order by 컬럼명 정렬방식(desc, asc)
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
where name = '원더걸스';

select *
from girl_group gg 
where `_id` = 13;

/*
 * 데이터 포멧 변경("%y %m %d")
 */
select 
`_id` 
,name 
,hit_song_id 
,date_format(debut,"%Y년-%m월-%d일") as debut 
from girl_group gg 

/*
 * like concat() 검색 기능
 * %텍스트 :앞 검색
 * 텍스트% :뒤 검색
 * %텍스트% :포함 검색
 */
select *
from girl_group gg 
where name like concat('%걸%');

/*
 * 중복 삭제 검색 
 */
select distinct (name) 
from girl_group ; 


