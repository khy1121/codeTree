const fs = require('fs');
// 0 대신 '/dev/stdin' 도 OK
const [a, b] = fs.readFileSync(0, 'utf8')
  .trim()
  .split(/\s+/)    // 공백·개행·탭 등 모든 공백문자 기준 분리
  .map(Number);



// 각 조건문을 a, b 로 바꿔줍니다.
console.log(a >= b ? 1 : 0);
console.log(a >  b ? 1 : 0);
console.log(b >= a ? 1 : 0);
console.log(b >  a ? 1 : 0);
console.log(a === b ? 1 : 0);
console.log(a !== b ? 1 : 0);
