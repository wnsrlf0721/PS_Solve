-- 코드를 입력하세요
select category, sum(sales) total_sales
from (SELECT category, bs.book_id, sum(sales) sales
    from BOOK_SALES bs
    join BOOK b
    on bs.book_id = b.book_id
    where date_format(sales_date,'%Y-%m') = '2022-01'
    group by book_id) sqt_book
group by category
order by category asc;