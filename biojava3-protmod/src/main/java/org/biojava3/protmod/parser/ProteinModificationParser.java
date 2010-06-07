/*
 *                    BioJava development code
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  If you do not have a copy,
 * see:
 *
 *      http://www.gnu.org/copyleft/lesser.html
 *
 * Copyright for this code is held jointly by the individual
 * authors.  These should be listed in @author doc comments.
 *
 * For more information on the BioJava project and its aims,
 * or to join the biojava-l mailing list, visit the home page
 * at:
 *
 *      http://www.biojava.org/
 *
 * Created on Jun 6, 2010
 * Author: Jianjiong Gao 
 *
 */

package org.biojava3.protmod.parser;

import java.util.List;
import java.util.Set;

import org.biojava.bio.structure.Structure;

import org.biojava3.protmod.ModifiedCompound;
import org.biojava3.protmod.ProteinModification;

/**
 * Identify protein modifications in a 3-d structure.
 */
public interface ProteinModificationParser {
	/**
	 * Parse modifications in a structure.
	 * @param structure query {@link Structure}.
	 * @param potentialModifications query {@link ProteinModification}s.
	 * @param modelnr model number.
	 * @return an list of {@link ModifiedCompound}s, or null if the
	 *  nodelnr is larger than or equal to the number of models in the structure.
	 */
	public List<ModifiedCompound> parse(Structure structure, 
			Set<ProteinModification> potentialModifications,
			int modelnr);
}