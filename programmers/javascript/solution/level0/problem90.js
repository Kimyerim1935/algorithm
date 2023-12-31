function solution(score) {
    const sorted = [...score].sort((a, b) => b[0] + b[1] - (a[0] + a[1])).map((x) => x[0] + x[1]);
    return score.map((x) => sorted.indexOf(x[0] + x[1]) + 1);
}
