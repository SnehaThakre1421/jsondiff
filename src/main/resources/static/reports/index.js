let dateInp = document.getElementById("date")
let valueInp = document.getElementById("value")
let inputKey = document.getElementById("inputKey")
let inputForm = document.getElementById("inputForm")

inputForm.addEventListener('submit', event => {
    // event.preventDefault()
    // event.stopPropagation()
    
    let dateVal = dateInp.value
    let valueInpdateVal = valueInp.value
    let inputKeyVal = inputKey.value
    console.log()
    if (!inputForm.checkValidity()) {
        // redirect to transcationlist
        console.log(event.value)
        console.log("form is valid")
      
    }
  }, false)