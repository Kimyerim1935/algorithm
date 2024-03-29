function solution(code) {
  let mode = 0;

  return [...code].reduce((acc, cur, index) => {
      if (mode) {
          if (cur !== '1' && index % 2 === 1) {
              return acc+cur;
          }
           if (cur === '1') mode = 0;
      } else {
          if (cur !== '1' && index % 2 === 0) {
              return acc + cur;
          }
          if (cur === '1') mode = 1;
      }
    return acc
  }, '') || "EMPTY"
}