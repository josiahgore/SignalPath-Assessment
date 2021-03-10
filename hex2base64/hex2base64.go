package main

import (
	"encoding/base64"
	"encoding/hex"
	"fmt"
	"os"
)

func main() {
	inputs := os.Args[1:]

	outputs := make([]string, len(inputs), len(inputs))
	for i, input := range inputs {
		decoded, err := hex.DecodeString(input)
		if err != nil {
			outputs[i] = fmt.Sprintf("Input %s is an invalid hex value", input)
		} else {
			outputs[i] = base64.StdEncoding.EncodeToString(decoded)
		}
	}

	for _, output := range outputs {
		fmt.Println(output)
	}
}