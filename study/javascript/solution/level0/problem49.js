function solution(s) {
    const numbers = [];

    for (const t of s.split(" ")) {
        if (t === "Z") {
            numbers.pop();
        } else {
            numbers.push(t);
        }
    }

    return numbers.reduce((acc, v) => acc + +v, 0);
}
