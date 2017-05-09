/* Copyright 2012-2016 Micronautics Research Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License. */

resolvers += Resolver.jcenterRepo
// b0rked, awaiting a fix, see https://github.com/sbt/sbt-bintray/issues/104
//addSbtPlugin("org.foundweekends" % "sbt-bintray" % "0.4.0")
addSbtPlugin("me.lessis" % "bintray-sbt" % "0.3.0")
