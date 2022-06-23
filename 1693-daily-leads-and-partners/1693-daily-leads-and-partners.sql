# Write your MySQL query statement below
select ds.date_id, ds.make_name, count(distinct(ds.lead_id)) as unique_leads, count(distinct(ds.partner_id)) as unique_partners
from DailySales ds
group by ds.date_id, ds.make_name