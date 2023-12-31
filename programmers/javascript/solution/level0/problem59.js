function solution(s) {
    var answer = "";
    let arr = s.split("").sort();
    for (let i = 0; i < arr.length; i++) {
        if (arr.filter((x) => x === arr[i]).length === 1) {
            answer += arr[i];
        }
    }
    return answer;
}
