function upper(n) {
	// in the upper half, no of stars before and after spacs are same
	// left stars = rownos, right stars = no of spaces
	// spaces ==> n-2*row
	for (let row = 1; row <= (n - 1) / 2; row += 1) {
		let str = '';
		//one loop for left stars
		let leftStars = row;
		for (let i = 1; i <= leftStars; i += 1) {
			str += '*';
		}

		let spaces = n - 2 * row;
		//one loop for spaces
		for (let j = 1; j <= spaces; j += 1) {
			str += ' ';
		}
		let rightStars = row;
		//one loop for right stars
		for (let k = 1; k <= rightStars; k += 1) {
			str += '*';
		}

		console.log(str);
	}
}

function middle(n) {
	let str = '';
	for (let i = 1; i <= n; i++) {
		str += '*';
	}
	console.log(str);
}

function lower(n) {
	//left stars =>n-1/2 -row +1
	//spaces row
	//rightspaces
	for (let row = 1; row <= (n - 1) / 2; row += 1) {
		let str = '';
		let leftStars = (n - 1) / 2 - row + 1;
		for (let j = 1; j <= leftStars; j += 1) {
			str += '*';
		}
		let spaces = 2 * row - 1;
		for (let j = 1; j <= spaces; j += 1) {
			str += ' ';
		}

		let rightStars = (n - 1) / 2 - row + 1;
		for (let k = 1; k <= rightStars; k += 1) {
			str += '*';
		}

		console.log(str);
	}
}

function pattern(n) {
	upper(n);
	middle(n);
	lower(n);
}

pattern(9);

// *       *
// **     **
// ***   ***
// **** ****
// *********
// **** ****
// ***   ***
// **     **
// *       *