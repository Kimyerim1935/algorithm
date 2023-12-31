function solution(my_string) {
    let answer = 0;

    let str = my_string.replace(/[^0-9]/g, " ");
    let arr = str.split(" ");
    for (i of arr) {
        answer += +i;
    }
    return answer;
}
