function solution(slice, n) {
    let peace = parseInt(n / slice);

    if (n % slice === 0) {
        return peace;
    }
    return peace + 1;
}
