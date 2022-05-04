#language:en
#Autor: Fernando Villa Alvarez
@stories
Feature: filtroOpencart
  Scenario Outline:As a user, I want to consult through filters the information of the Product Returns
                   tab of the opencart page
  Given User of the Opencart page
    When Consult the information of the product return department
      | username   | password   | option_sales   | return_id   | order_id   | customer   | product   | model   | status   | info_pages   |
      | <username> | <password> | <option_sales> | <return_id> | <order_id> | <customer> | <product> | <model> | <status> | <info_pages>|
    Then Know the list of existing products in return

   Examples:
     | username | password | option_sales | return_id | order_id | customer    | product   | model      | status            | info_pages                    |
     | demo     | demo     | Returns      | 38591     | 16537    | wdsqa ascas | HP LP3065 | Product 21 | Awaiting Products | Showing 1 to 1 of 1 (1 Pages) |
