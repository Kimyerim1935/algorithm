function solution(array, n) {
    var arr = array.sort((a, b) => a - b).map((v) => Math.abs(v - n));
    return array[arr.indexOf(Math.min(...arr))];
}
