// if we divide a/b ==> we can say a = b*q+r assuming a >b.
// gcd assume is G => a%G == 0 && b%G == 0
// so we can say, G will also divide lutiple of b.
// so a is divisible by G and bq is alos divisible by G , so a-bq=r
//G will divide r as well.
// G is the gcd of a,b,r as well, ans as a>b and b > r.
// so to calculate gcd of 2 number a,b we should first calculate the
// remainder and we should  calculate the gcd of b and remainder. again
//  to calucate that, we use the smae technique till we get two numbers
// such that we got remainer as 0. the b which makes the remainder 0 is our final GCD.


function GCD_EuclidsAlgo(a, b) {
    while (a%b !== 0){
        let remainder = a % b;
		a = b;
		b = remainder;

	}
    console.log(b);
}

GCD_EuclidsAlgo(24, 27);
