$( document ).ready(function() {
    let transactionList = [{
	id:123456,
	api:"ClaimService: getAmosMailOrderSummaryApi"
},{id: 098765, api:"ClaimService: getAmosMailOrderDetailApi"}]

let tableRef = $("#transactionList")

transactionList.forEach((transaction)=>{
	let url = `../jdd-master/index.html?transactionid=${transaction.id}`
	let row = ` <tr>
    <td>${transaction.id}</td>
    <td>${transaction.api}</td>
    <td><a href="${url}">View</td>
  </tr>`
	tableRef.append($(row))
})
});