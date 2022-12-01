#!/usr/bin/env bash

set -o errexit
set -o pipefail

if [[ -z ${AOC_COOKIE} ]]; then AOC_COOKIE="$(cat "cookie.txt")"; fi

day="${1:-$(date +"%Oe" | sed 's/[[:blank:]]//')}"
year="${2:-$(date +"%Y")}"

local_path="src/test/resources/inputs/${year}/day${day}"

echo >&2 "Downloading input file (day: ${day} year: ${year}) to: ${local_path}"

if [[ -f "${local_path}" ]]; then
    echo >&2 "File already present, skipping download..."
    exit 0
fi

curl \
    --fail \
    --location \
    --create-dirs \
    --no-progress-meter \
    --output "${local_path}" \
    --header "cookie: session=${AOC_COOKIE}" \
    "https://adventofcode.com/${year}/day/${day}/input"
