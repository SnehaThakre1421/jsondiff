function showError(error){
  let errorLog = $("#errorLog")
  let errorContent = `<div>${error.message}</div>`
  errorContent.append($(errorContent))
}
async function getData(date, value, inputKey){
  // TODO - correct the url here
  // let url = `xyz?date=${date}&value=${value}&inputKey=${inputKey}`
  // let response = await fetch(url)
  // let transactionList = response.json()
  // return transactionList

  let transactionList = [{
    id:123456,
    api:"ClaimService: getAmosMailOrderSummaryApi"
  },{id: 098765, api:"ClaimService: getAmosMailOrderDetailApi"}]

  return transactionList

}

function insertData(transactionList){

  let tableRef = $("#transactionList")

  transactionList.forEach((transaction)=>{
    let url = `../jdd-master/index.html?transactionid=${transaction.id}`
    let row =`
    <tr>
      <th scope="row">${transaction.id}</th>
      <td>${transaction.api}</td>
      <td><a href="${url}"><i class="bi-box-arrow-up-right"></i></a></td>
    </tr>
    `
    // let row = ` <tr>
    //   <td>${transaction.id}</td>
    //   <td>${transaction.api}</td>
    //   <td><a href="${url}">View</td>
    // </tr>`
    tableRef.append($(row))
  })
}



$( document ).ready(function() {
  const queryParams = new URLSearchParams(window.location.search);
  let dateInp = queryParams.get("date") 
  let valueInp = queryParams.get("value")
  let inputKey = queryParams.get("inputKey")

  // These are the value coming from report.html
  console.log(dateInp, valueInp, inputKey)

  getData(dateInp, valueInp, inputKey).then(insertData).catch(showError)


});