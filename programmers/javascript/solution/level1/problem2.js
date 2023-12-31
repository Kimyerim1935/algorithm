function solution(n) {
  let answer = [];
  let string = n.toString()

  for(let i = string.length; i > 0; i--){
    answer.push(parseInt(string.substr((i-1), 1)));
  }

  return answer;
}

solution([1,2,3,4,5]);