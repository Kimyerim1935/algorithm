function solution(n) {
    return [...("" + n)].map((num) => +num).reduce((a, b) => a + b, 0);
}
