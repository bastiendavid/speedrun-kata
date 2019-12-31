#!/usr/bin/env bash

set -eo pipefail

source ./nvm.sh

if [[ ! $(command -v yarn) ]]; then
    npm install -g yarn
fi

yarn install

yarn run tsc --noEmit

yarn test