function sumOfDigits(n){
    let digit  = String(n);
    let sum =0;
    for(let i=0;i<digit.length;i++){
        sum += Number(digit.charAt(i));
    }
    console.log(sum);
}

sumOfDigits(4136);