/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2017 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.cactoos.scalar;

import java.util.Collections;
import org.cactoos.Scalar;
import org.cactoos.iterable.IterableOf;
import org.cactoos.list.ListOf;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;

/**
 * Test case for {@link AvgOf}.
 *
 * @author Vseslav Sekorin (vssekorin@gmail.com)
 * @version $Id$
 * @since 0.24
 * @checkstyle JavadocMethodCheck (500 lines)
 * @checkstyle MagicNumberCheck (500 lines)
 */
public final class AvgOfTest {

    @Test
    public void withEmptyCollection() {
        MatcherAssert.assertThat(
            new AvgOf(Collections.emptyList()).longValue(),
            Matchers.equalTo(0L)
        );
    }

    @Test
    public void withIntegerCollection() {
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1, 2, 3, 4).toArray(new Integer[4])
            ).intValue(),
            Matchers.equalTo(2)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1, 2, 3, 4).toArray(new Integer[4])
            ).longValue(),
            Matchers.equalTo(2L)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1, 2, 3, 4).toArray(new Integer[4])
            ).doubleValue(),
            Matchers.equalTo(2.5d)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1, 2, 3, 4).toArray(new Integer[4])
            ).floatValue(),
            Matchers.equalTo(2.5f)
        );
    }

    @Test
    public void withLongCollection() {
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1L, 2L, 3L, 4L).toArray(new Long[4])
            ).intValue(),
            Matchers.equalTo(2)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1L, 2L, 3L, 4L).toArray(new Long[4])
            ).longValue(),
            Matchers.equalTo(2L)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1L, 2L, 3L, 4L).toArray(new Long[4])
            ).doubleValue(),
            Matchers.equalTo(2.5d)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1L, 2L, 3L, 4L).toArray(new Long[4])
            ).floatValue(),
            Matchers.equalTo(2.5f)
        );
    }

    @Test
    public void withDoubleCollection() {
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1.0d, 2.0d, 3.0d, 4.0d).toArray(new Double[4])
            ).intValue(),
            Matchers.equalTo(2)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1.0d, 2.0d, 3.0d, 4.0d).toArray(new Double[4])
            ).longValue(),
            Matchers.equalTo(2L)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1.0d, 2.0d, 3.0d, 4.0d).toArray(new Double[4])
            ).doubleValue(),
            Matchers.equalTo(2.5d)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1.0d, 2.0d, 3.0d, 4.0d).toArray(new Double[4])
            ).floatValue(),
            Matchers.equalTo(2.5f)
        );
    }

    @Test
    public void withFloatCollection() {
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1.0f, 2.0f, 3.0f, 4.0f).toArray(new Float[4])
            ).intValue(),
            Matchers.equalTo(2)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1.0f, 2.0f, 3.0f, 4.0f).toArray(new Float[4])
            ).longValue(),
            Matchers.equalTo(2L)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1.0f, 2.0f, 3.0f, 4.0f).toArray(new Float[4])
            ).doubleValue(),
            Matchers.equalTo(2.5d)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new ListOf<>(1.0f, 2.0f, 3.0f, 4.0f).toArray(new Float[4])
            ).floatValue(),
            Matchers.equalTo(2.5f)
        );
    }

    @Test
    public void withScalars() {
        MatcherAssert.assertThat(
            new AvgOf(
                () -> 1L, () -> 2L, () -> 10L
            ).longValue(),
            Matchers.equalTo(4L)
        );
        MatcherAssert.assertThat(
            new AvgOf(
                new IterableOf<Scalar<Number>>(() -> 1L, () -> 2L, () -> 10L)
            ).longValue(),
            Matchers.equalTo(4L)
        );
    }

}
