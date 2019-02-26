## CMPE 202 Lab 4

##### Use Chain of Responsibility Design Pattern

Because we are dealing with chains made up of links, tables chain and reservation chain, each time one table becomes available, it will only send notification to one customer in the reservation queue, so Chain of Responsibility pattern could avoid coupling the sender of a request to the receiver by giving more than one object a chance to handle the request.

##### CRC Cards

##### Class Lists:

- Table

  Responsibility: track table id, table seats number, table status ("busy" or "ready"), table current customer

  Collaborators: Table Queue

- Table Queue

  A queue of Table

  Responsibility:

  1. Track all the tables: status ("Busy" or "Ready"), table number, customer reservation number, number of seats

  	2. Send the information of the table to Table Manager if a table becomes "Ready"
  	Accommodate customers if receive confirm from Table Manager

  Collaborators: Table Manager

- Table Manager

  Responsiblity:

  1. Get the available table number and the maximum seats of the table when a table in table queue becomes "Ready"
  2. Send the information of open table to Reservation Manager
  3. Get "Confirm" information from Reservation Manager and set the status of active table from "Ready" to "Busy"

  Collaborators: Table Queue, Reservation Manager

- Reservation

  Responsibility:

  1. Track Customer Name, Phone Number, # of people in the group
  2. Interact with Reservation Manager on actions like: cancel reservation, confirm table

  Collaborators: Reservation Manager, Reservation Queue

- Reservation Queue

  Responsibility:

  1. Get the first qualified reservation in the queue if Reservation Manager requests
  2. Add a new reservation at the end of the queue if Reservation Manager creates a new reservation
  3. Remove a reservation if the Reservation Manager sends out a remove request

  Collaborators: Reservation, Reservation Queue

- Reservation Manager

  Responsibility:

  1. Create a new reservation and send the request to Reservation Queue
  2. Remove a reservation from Reservation Queue if customers reply "Leave"
  3. If Table Manager sends out a Ready table, match the first reservation which meets the seat number qualification and send messages to a customer
  4. Send reservation number and customer numbers to Table Manager if customer CONFIRMS the table.

  Collaborators: Table Manager, Reservation Queue, Reservation



