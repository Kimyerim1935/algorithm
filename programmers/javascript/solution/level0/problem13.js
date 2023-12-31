function solution(n) {
    let int = parseInt(n / 7);
    if (n % 7 === 0) {
        return int;
    }
    return int + 1;
}
