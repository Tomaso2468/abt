/*
BSD 3-Clause License

Copyright (c) 2019, Tomas
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this
   list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice,
   this list of conditions and the following disclaimer in the documentation
   and/or other materials provided with the distribution.

3. Neither the name of the copyright holder nor the names of its
   contributors may be used to endorse or promote products derived from
   this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package io.github.tomaso2468.abt;

/**
 * <p>
 * A tag holding a string value with a length measured as a signed 16bit
 * integer. If a higher length is required use {@code TagString} instead.
 * </p>
 * 
 * @author Tomas
 * 
 * @see io.github.tomaso2468.abt.TagString
 */
public class TagStringShort extends TagString {
	/**
	 * ID for serilization.
	 */
	private static final long serialVersionUID = 4128177059182617455L;

	/**
	 * Constructs a new short string tag.
	 * 
	 * @param name The name of the tag.
	 * @param data The data of the tag.
	 */
	public TagStringShort(String name, String data) {
		super(name, data);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public byte getType() {
		return 0x0A;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public TagStringShort clone() {
		return new TagStringShort(name, getData());
	}
}
