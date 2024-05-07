// for prime no we have a corner case, as they have GCD as 1.
function GCD(a,b){
    let ans=1;
    for(let i=2;i<=Math.min(a,b);i++){
        if(a%i==0 && b%i==0){
            ans = i;
        }
    }


    console.log(ans);
}

GCD(24,27);