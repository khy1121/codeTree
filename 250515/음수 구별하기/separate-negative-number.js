const fs = require(`fs`);
let N  = fs.readFileSync("/dev/stdin").toString().trim();
if( N>0){console.log(N)}
else {
    console.log(N);
    console.log("minus");
} 